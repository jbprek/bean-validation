package org.hibernate.validator.referenceguide.chapter03.parameterscriptassert;

import org.hibernate.validator.constraints.ParameterScriptAssert;

import java.util.List;

public class Car {

    @ParameterScriptAssert(lang = "javascript", script = "arg1.size() <= arg0.size() * 2")
    public void load(List<Person> passengers, List<PieceOfLuggage> luggage) {
        //...
    }
}
