package controllers;

import models.Persona;

public class PersonaController {
    // MEtodo de ordenamiento seleccion desendente
     public void sortByDireccion(Persona[] personas) {
        for(int i = 0; i < personas.length; i++) {
            int indexMayor = i + 1;
            for(int j = i + 1; j <  personas.length -1; j++) {
                if(personas[j].compareCodigoDireccion(personas[i])) {
                    indexMayor = j;
                }
            }
            if (i != indexMayor) {
                Persona auz = personas[indexMayor];
                personas[indexMayor] = personas[i];
                personas[i] = auz;
            }
        }

    }

    public Persona findByCodigo(Persona[] personas, int  codigo) {
        int bajo = 0;
        int alto = personas.length -1;
        boolean encomtrar = false;

        while(bajo <= alto) {
            int center = (bajo + alto) / 2;
            if(personas[center].equalsByCodigoDireccion(codigo)) {
                return personas[center];
        }
        encomtrar = personas[center].compareCodigoDireccion(codigo) ? (bajo = center + 1) > 0 : (alto = center -1) > 0;
    }
    return null;
    }
}

