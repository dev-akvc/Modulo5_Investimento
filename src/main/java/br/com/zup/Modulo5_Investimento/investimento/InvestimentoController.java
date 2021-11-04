package br.com.zup.Modulo5_Investimento.investimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @PutMapping("/{email}")
    public InvestimentoDTO cadastrarInvestimento(@PathVariable String email){
        return null;
    }
}
