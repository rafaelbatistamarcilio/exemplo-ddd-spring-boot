package com.app.exemploddd.ordemCompra.infraestrutura.util.validation;

import com.app.exemploddd.ordemCompra.dominio.dto.OrdemCompraDto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrdemCompraValidator implements ConstraintValidator<OrdemCompraValidation, OrdemCompraDto> {

    @Override
    public void initialize(final OrdemCompraValidation constraintAnnotation) {

    }

    @Override
    public boolean isValid(final OrdemCompraDto value, final ConstraintValidatorContext context) {
        return false;
    }
}
