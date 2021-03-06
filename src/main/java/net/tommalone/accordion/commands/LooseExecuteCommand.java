package net.tommalone.accordion.commands;

import net.tommalone.accordion.internal.LooseOgnlEvaluator;
import net.tommalone.accordion.internal.ReflectiveHelper;
import org.concordion.api.AbstractCommand;
import org.concordion.api.CommandCall;
import org.concordion.api.Evaluator;
import org.concordion.api.ResultRecorder;
import org.concordion.internal.OgnlEvaluator;
import org.concordion.internal.command.ExecuteCommand;

public class LooseExecuteCommand extends AbstractCommand {
    private ExecuteCommand executeCommand = new ExecuteCommand();

    @Override
    public void execute(CommandCall commandCall, Evaluator evaluator, ResultRecorder resultRecorder) {
        executeCommand.execute(commandCall, new LooseOgnlEvaluator(evaluator), resultRecorder);
    }
}
