package com.br.view;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import com.br.model.Idade;

public class Aplication {

	public static void main(String[] args) {
		Idade idade = new Idade();
		try (Scanner scanf = new Scanner(System.in)) {

			System.out.println("Data de nascimento (dd/MM/yyyy)");
			idade.setNascimento(scanf.next());

			System.out.println(idade.calcularIdade() + " anos");
		}
	}

}
