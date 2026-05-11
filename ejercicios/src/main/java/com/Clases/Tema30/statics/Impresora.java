package com.Clases.Tema30.statics;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter

public class Impresora {
    private int id;
    private String marca;
    private String tipoTinta;
}
