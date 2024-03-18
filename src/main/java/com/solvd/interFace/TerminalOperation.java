package com.solvd.interFace;
//Операции с грузом
public interface TerminalOperation {
    void cargoLoadingStarted();
    void cargoLoadingCompleted();
    void boardingPermission();
    void boardingCompletion();
}
