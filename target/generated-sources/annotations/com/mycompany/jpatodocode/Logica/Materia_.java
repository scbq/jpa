package com.mycompany.jpatodocode.Logica;

import com.mycompany.jpatodocode.Logica.Carrera;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-24T12:20:37", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Materia.class)
public class Materia_ { 

    public static volatile SingularAttribute<Materia, String> tipo;
    public static volatile SingularAttribute<Materia, Integer> idMateria;
    public static volatile SingularAttribute<Materia, String> nombreMateria;
    public static volatile SingularAttribute<Materia, Carrera> carre;

}