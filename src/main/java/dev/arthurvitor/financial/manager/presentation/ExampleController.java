package dev.arthurvitor.financial.manager.presentation;

import dev.arthurvitor.financial.manager.application.command.ExampleCommand.CreateExampleCommand;
import dev.arthurvitor.financial.manager.application.context.NotificationContext;
import dev.arthurvitor.financial.manager.application.dto.ApiResponse;
import dev.arthurvitor.financial.manager.application.dto.ExampleDto.ExampleDto;
import dev.arthurvitor.financial.manager.application.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController extends BaseApiController {
    private final ExampleService exampleService;

    public ExampleController(NotificationContext notificationContext, ExampleService exampleService) {
        super(notificationContext);
        this.exampleService = exampleService;
    }

    @PostMapping("success")
    public ResponseEntity<ApiResponse<ExampleDto>> success(@RequestBody CreateExampleCommand command) {
        return result(exampleService.sucess(command));
    }

    @GetMapping("failure")
    public ResponseEntity<ApiResponse<Boolean>> failure() {
        return result(exampleService.failure());
    }
}
