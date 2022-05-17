package com.playerscoutingapp.service;

import com.playerscoutingapp.model.Player;
import com.playerscoutingapp.model.Signing;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Sheika Abuthair
 * @Date : 16-05-2022
 * @Project : assignmentProject
 */
public interface ISigningService {
    void addSigning(Signing signing);

    void updateSigning(Signing signing);

    void deleteSigning(int signingId);

    Signing getById(int signingId);

    List<Signing> getAll();

    List<Signing> getByPrice(int price);

    List<Signing> getByDateBetween(LocalDate date1,LocalDate date2);

}
