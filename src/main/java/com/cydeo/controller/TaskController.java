package com.cydeo.controller;

import com.cydeo.dto.ResponseWrapper;
import com.cydeo.dto.TaskDTO;
import com.cydeo.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/project")
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public ResponseEntity<ResponseWrapper> getTasks(){
        List<TaskDTO> taskDTOList = taskService.listAllTasks();
        return ResponseEntity.ok(new ResponseWrapper("Tasks are successfully retrieved", taskDTOList, HttpStatus.OK));
    }


    @GetMapping("/{taskId}")
    public ResponseEntity<ResponseWrapper> getTasksById(@PathVariable ("taskId") Long taskId){
        TaskDTO taskDTO = taskService.findById(taskId);
        return ResponseEntity.ok(new ResponseWrapper("Task is successfully retrieved", taskDTO, HttpStatus.OK));
    }


    @PostMapping
    public ResponseEntity<ResponseWrapper> createTasks(TaskDTO taskDTO){
        taskService.save(taskDTO);
        return ResponseEntity.ok(new ResponseWrapper("Task is successfully created", HttpStatus.CREATED));
    }


    @PostMapping("/taskId")
    public ResponseEntity<ResponseWrapper> deleteTasks(@PathVariable ("taskId") Long taskId){
        taskService.delete(taskId);
        return ResponseEntity.ok(new ResponseWrapper("Task is successfully deleted", HttpStatus.CREATED));
    }


    @PutMapping
    public ResponseEntity<ResponseWrapper> updateTasks(@RequestBody TaskDTO taskDTO){
        taskService.save(taskDTO);
        return ResponseEntity.ok(new ResponseWrapper("Task is successfully updated", HttpStatus.CREATED));

    }



    public ResponseEntity<ResponseWrapper> employeePendingTasks(){

    }


    public ResponseEntity<ResponseWrapper> employeeUpdateTasks(){}


    public ResponseEntity<ResponseWrapper> employeeArchivedTasks(){}





}
