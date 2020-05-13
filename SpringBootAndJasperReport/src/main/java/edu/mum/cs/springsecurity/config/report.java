package edu.mum.cs.springsecurity.config;


import net.sf.jasperreports.engine.JRAbstractScriptlet;
import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;
import net.sf.jasperreports.engine.fill.JRFillField;
import sun.tools.tree.NewArrayExpression;

public class report  extends JRDefaultScriptlet {
    public String hello() throws JRScriptletException
    {
        return "Hello! I'm the report's scriptlet object.";
    }

    @Override
    public void beforeReportInit() throws JRScriptletException {

    }

    @Override
    public void afterReportInit() throws JRScriptletException {
        this.setVariableValue("Variable_1", "Set value for variable");
        //this.fieldsMap("ab", JRFillField)
        String Variable_1 = (String)this.getVariableValue("Variable_1");
        System.out.println(Variable_1);
    }

    @Override
    public void beforePageInit() throws JRScriptletException {

    }

    @Override
    public void afterPageInit() throws JRScriptletException {

    }

    @Override
    public void beforeColumnInit() throws JRScriptletException {

    }

    @Override
    public void afterColumnInit() throws JRScriptletException {

    }

    @Override
    public void beforeGroupInit(String s) throws JRScriptletException {

    }

    @Override
    public void afterGroupInit(String s) throws JRScriptletException {


    }

    @Override
    public void beforeDetailEval() throws JRScriptletException {
// this.setVariableValue("");

    }

    @Override
    public void afterDetailEval() throws JRScriptletException {

    }
}
