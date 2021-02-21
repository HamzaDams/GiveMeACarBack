package fr.givemeacar.givemecar.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = {"fr.givemeacar.givemecar"}) //https://zetcode.com/springboot/controlleradvice/
public class GlobalHandlerContollerException extends ResponseEntityExceptionHandler {

    /**
     * Permet de bind avant chaque appel au controller pour personnaliser la demande envoye
     * @param binder
     */
    @InitBinder
    public void dataBinding(WebDataBinder binder){

    }

    /**
     * Création d'un model type pour les technicalError
     * @param model
     */
    @ModelAttribute
    public void globalAttributes(Model model){
        model.addAttribute("technicalError","Une erreur technique est survenue !");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BusinessResourceExceptionDTO> unknowError(HttpServletRequest req, Exception ex){
        BusinessResourceExceptionDTO response = new BusinessResourceExceptionDTO();
        response.setErrorCode("Technical Error");
        response.setErrorMessage(ex.getMessage());
        response.setRequestURL(req.getRequestURL().toString());
        return new ResponseEntity<BusinessResourceExceptionDTO>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BusinessResourceException.class)//toutes les autres erreurs non gérées par le service sont interceptées ici
    public ResponseEntity<BusinessResourceExceptionDTO> businessResourceError(HttpServletRequest req, BusinessResourceException ex) {
        BusinessResourceExceptionDTO businessResourceExceptionDTO = new BusinessResourceExceptionDTO();
        businessResourceExceptionDTO.setStatus(ex.getStatus());
        businessResourceExceptionDTO.setErrorCode(ex.getErrorCode());
        businessResourceExceptionDTO.setErrorMessage(ex.getMessage());
        businessResourceExceptionDTO.setRequestURL(req.getRequestURL().toString());
        return new ResponseEntity<BusinessResourceExceptionDTO>(businessResourceExceptionDTO, ex.getStatus());
    }
}
