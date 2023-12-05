package com.br.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Idade {

	private String nascimento;
	private int idade;
	DateTimeFormatter date;
	LocalDate dataNascimento;
	LocalDate dataAtual;
	Period periodo;

	public Idade() {
		date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dataAtual = LocalDate.now();
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public DateTimeFormatter getDate() {
		return date;
	}

	public void setDate(DateTimeFormatter date) {
		this.date = date;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(LocalDate dataAtual) {
		this.dataAtual = dataAtual;
	}

	public Period getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Period periodo) {
		this.periodo = periodo;
	}

	public int calcularIdade() {
		dataNascimento = LocalDate.parse(nascimento, date);
		periodo = Period.between(dataNascimento, dataAtual);
		return periodo.getYears();
	}
}
