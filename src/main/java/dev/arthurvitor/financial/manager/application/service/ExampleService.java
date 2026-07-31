package dev.arthurvitor.financial.manager.application.service;

import dev.arthurvitor.financial.manager.application.command.ExampleCommand.CreateExampleCommand;
import dev.arthurvitor.financial.manager.application.dto.ExampleDto.ExampleDto;

public interface ExampleService {
    ExampleDto sucess(CreateExampleCommand command);
    boolean failure();
}
