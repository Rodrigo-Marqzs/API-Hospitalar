package com.rodrigo.hospitalapi.model;

public class TesteMedico {

    public static void main(String[] args) {

        Medico medico = new Medico(
                1,
                "John Frusciante",
                "Cardiologista",
                "6767");

        medico.setEspecialidade("Neurologista");


        System.out.println(medico.getNome());
        System.out.println(medico.getCrm());
        System.out.println(medico.getEspecialidade());

    } }
