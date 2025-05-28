package util;

import factory.DocumentoBrasilFactory;
import factory.DocumentoEUAFactory;
import factory.DocumentoFactory;

public class FabricaDocumentosFactory {
    public static DocumentoFactory getFactory(String pais) {
        return switch (pais.toUpperCase()) {
            case "BR" -> new DocumentoBrasilFactory();
            case "US" -> new DocumentoEUAFactory();
            default -> throw new IllegalArgumentException("País não suportado: " + pais);
        };
    }
}
