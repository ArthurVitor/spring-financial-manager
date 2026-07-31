package dev.arthurvitor.financial.manager.application.service.impl;

import dev.arthurvitor.financial.manager.application.command.ExampleCommand.CreateExampleCommand;
import dev.arthurvitor.financial.manager.application.dto.ExampleDto.ExampleDto;
import dev.arthurvitor.financial.manager.application.service.ExampleService;
import dev.arthurvitor.financial.manager.domain.repository.ExampleRepository;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl extends BaseService implements ExampleService {
    private final ExampleRepository exampleRepository;

    public ExampleServiceImpl(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    @Override
    public ExampleDto sucess(CreateExampleCommand command) {
        return new ExampleDto(command.success());
    }

    @Override
    public boolean failure() {
        if (true) {
            notify("Failure");
            return false;
        }

        return false;
    }
}
