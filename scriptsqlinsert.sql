INSERT INTO `agence` (`id`, `administrateur`, `adresse`, `is_siege`, `ville`) VALUES
    (1, 'Dams', '1 rue de l\'autre', b'0', 'Nantes'),
(2, 'Dams', '1 rue de l\'autre', b'0', 'Nantes'),
    (3, 'Dams', '1 rue de l\'autre', b'0', 'Paris'),
(4, 'Dams', '1 rue de l\'autre', b'0', 'Rennes'),
    (5, 'Dams', '1 rue de l\'autre', b'0', 'Vannes'),
(6, 'Dams', '1 rue de l\'autre', b'0', 'Marseille');

INSERT INTO `vehicule` (`vehicule_id`, `couleur`, `etat`, `immat`, `kilometrage`, `localisation`, `marque`, `modele`, `niv_carburant`, `id`) VALUES
    (2, 'Noir', b'0', 'AA-111-ZZ', 110, '45.1,-1.5', 'Renault', 'Clio 4', 50, 1),
    (3, 'Noir', b'0', 'AA-111-ZZ', 110, '45.1,-1.5', 'Renault', 'Clio 4', 50, 2),
    (4, 'Noir', b'0', 'AA-111-ZZ', 110, '45.1,-1.5', 'Renault', 'Clio 4', 50, 3),
    (5, 'Noir', b'0', 'AA-111-ZZ', 110, '45.1,-1.5', 'RS4', 'Audit', 50, 3),
    (6, 'Noir', b'0', 'AA-111-ZZ', 110, '45.1,-1.5', 'RS4', 'Audi', 50, 4);