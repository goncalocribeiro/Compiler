/** @version  */
package pex.app.main;

import pex.Interpreter;
import pex.operators.Program;
import pex.Manager;
import pex.app.evaluator.EvaluatorMenu;
import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;
import pt.tecnico.po.ui.Menu;

/**
 * Open menu for managing programs.
 */
public class DoManageProgram extends Command<Manager> {
  /** Input field. */
  Input<String> _program;

  /**
   * @param receiver
   */
  public DoManageProgram(Manager receiver) {
    super(Label.MANAGE_PROGRAM, receiver);
    _program = _form.addStringInput(Message.requestProgramId());
  }

  /** @see pt.tecnico.po.ui.Command#execute() */
  @Override
  public final void execute() {
    _form.parse();
    
    Program program = _receiver.getProgram(_program.value());
    Interpreter interpreter = _receiver.getInterpreter();
    
    if(program != null){
        Menu m = new EvaluatorMenu(interpreter, program);
        m.open();
    }
    else{
        _display.popup(Message.noSuchProgram(_program.value()));
    }
  }

}
