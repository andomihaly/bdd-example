package hu.idom.server.calculator.controller;

import hu.idom.calculator.Calculator;
import hu.idom.server.calculator.controller.model.CalculatorRequestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CalculatorController {
    @PostMapping("add")
    public int add(@RequestBody CalculatorRequestModel calculatorModel){
        Calculator calculator = new Calculator();
        return calculator.add(calculatorModel.number1, calculatorModel.number2);
    }

    @PostMapping("multiply")
    public int multiply(@RequestBody CalculatorRequestModel calculatorModel){
        Calculator calculator = new Calculator();
        return calculator.multiply(calculatorModel.number1, calculatorModel.number2);
    }
}
