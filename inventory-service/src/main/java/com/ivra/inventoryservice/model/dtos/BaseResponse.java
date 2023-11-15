package com.ivra.inventoryservice.model.dtos;

public record BaseResponse(String[] errorMessages) {

    public boolean hasErrors(){
        return errorMessages != null && errorMessages.length >0;
    }
}
