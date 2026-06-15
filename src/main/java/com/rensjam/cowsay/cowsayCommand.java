package com.rensjam.cowsay;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class cowsayCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 0) {
            sender.sendMessage("§cUsage: /cowsay <message>");
            return true;
        }

        String message = String.join(" ", args);

        String bubbleTop = " " + "_".repeat(message.length() + 2);
        String bubbleMiddle = "< " + message + " >";
        String bubbleBottom = " " + "-".repeat(message.length() + 2);

        sender.sendMessage(bubbleTop);
        sender.sendMessage(bubbleMiddle);
        sender.sendMessage(bubbleBottom);

        sender.sendMessage("        \\   ^__^");
        sender.sendMessage("         \\  (oo)\\_______");
        sender.sendMessage("            (__)\\       )\\/\\");
        sender.sendMessage("                ||----w |");
        sender.sendMessage("                ||     ||");

        return true;
    }

}
