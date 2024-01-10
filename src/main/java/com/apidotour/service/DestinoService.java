package com.apidotour.service;

import java.util.List;

import com.apidotour.model.Destino;

public interface DestinoService {

    List<Destino> getAllDestinos();

    Destino getDestinoById(Long id);

    Destino saveDestino(Destino destino);

    List<Destino> getDestinosByDestino(String destino);
}
