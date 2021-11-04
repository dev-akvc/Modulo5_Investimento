package br.com.zup.Modulo5_Investimento.investimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @GetMapping
    public List<InvestimentoDTO> exibirInvestimentos (){
        return investimentoService.exibirInvestimentos();
    }

    @PutMapping("/{email}")
    public void cadastrarInvestimento(@RequestBody @Valid  InvestimentoDTO investimentoDTO){
        investimentoService.cadastrarInvestimento(investimentoDTO);
    }
}
