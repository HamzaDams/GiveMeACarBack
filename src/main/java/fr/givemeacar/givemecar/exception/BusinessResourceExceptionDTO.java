package fr.givemeacar.givemecar.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BusinessResourceExceptionDTO {

    private String errorCode;
    private String errorMessage;
    private String requestURL;
    private HttpStatus status;

    public BusinessResourceExceptionDTO() {
    }

}
