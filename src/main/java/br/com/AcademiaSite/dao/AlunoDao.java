package br.com.AcademiaSite.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.AcademiaSite.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

}
