package com.ecole221.secureApp.keycloak;

import org.keycloak.representations.idm.CredentialRepresentation;

public class Credentials {

    public static CredentialRepresentation createPassword(String password){
        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();

        credentialRepresentation.setTemporary(false);
        credentialRepresentation.setType(CredentialRepresentation.PASSWORD);
        credentialRepresentation.setValue(password);

        return credentialRepresentation;
    }
}
