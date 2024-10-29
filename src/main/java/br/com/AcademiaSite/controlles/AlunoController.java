package br.com.AcademiaSite.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.AcademiaSite.dao.AlunoDao;
import br.com.AcademiaSite.model.Aluno;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoDao alunoRepositorio;
	
	@GetMapping("CadastrarAluno")
	public ModelAndView cadastrarAlunos() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cadastro/cadastro");
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	
	@GetMapping("listAlunos")
	public ModelAndView pesquisarAluno() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listAluno/listAluno");
		mv.addObject("alunosList", alunoRepositorio.findAll());// findAll() listar todos os dados;
		return mv;
	}
	
	@PostMapping("InsertAlunos") // cria um post
    public ModelAndView insertAluno(Aluno aluno) {
		ModelAndView mv = new ModelAndView();	
		mv.setViewName("redirect:/listAlunos");
		alunoRepositorio.save(aluno);
		return mv;
    }
	
	
}
