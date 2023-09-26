package com.mycompany.jpatodocode.Logica;

import com.mycompany.jpatodocode.Logica.Materia;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-24T12:20:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, Integer> idCarrera;
    public static volatile SingularAttribute<Carrera, String> nombreCarrera;
    public static volatile ListAttribute<Carrera, Materia> listaMateria;

}