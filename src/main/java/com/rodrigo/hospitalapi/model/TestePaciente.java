package com.rodrigo.hospitalapi.model;

public class TestePaciente {

    public static void main(String[] args) {

        Paciente paciente = new Paciente(
                "Rodrigo",
                "00000000000",
                "rodrigo@gmail.com");

        paciente.setNome("João");
        paciente.setCpf("00000000001");
        paciente.setEmail("João@gmail.com");

        System.out.println(paciente.getNome());
        System.out.println(paciente.getCpf());
        System.out.println(paciente.getEmail());
        System.out.println(paciente.getId());

    }

}