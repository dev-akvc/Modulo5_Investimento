package br.com.zup.Modulo5_Investimento.investimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

//    @PutMapping
//    public boolean retornarcadastroInvestimento(@RequestBody @Valid InvestimentoDTO investimentoDTO){
//        boolean carteiraDTO = investimentoService.salvarInvestimento(investimentoDTO.getValorInvestido());
//        return carteiraDTO;
//    }

//    @GetMapping
//    public double exibirInvestimentos (InvestimentoDTO investimentoDTO){
//        return investimentoService.exibirResposta(investimentoDTO);
//    }

}
