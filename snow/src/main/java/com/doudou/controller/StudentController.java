package com.doudou.controller;

import com.doudou.core.SnowException;
import com.doudou.model.CommonResponse;
import com.doudou.model.StudentVo;
import com.doudou.model.request.StudentInsertRequest;
import com.doudou.model.student.StudentDto;
import com.doudou.service.StudentServiceImpl;
import com.doudou.util.Convert;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjiaming on 2017/7/9.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @ApiOperation("获取所有学生的接口")
    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
    public ResponseEntity<CommonResponse> getAll() throws SnowException {
        List<StudentDto> list = studentService.getAllStudents();
        List<StudentVo> result = new ArrayList<>(list.size());
        for (StudentDto student : list) {
            result.add(Convert.convertStudent(student));
        }
        return new ResponseEntity<>(new CommonResponse(result), HttpStatus.OK);
    }

    @ApiOperation("插入一条学生数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name="insertRequest", value="傅红雪,灭绝十字刀法,0", dataType = "StudentInsertRequest")
    })
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity<CommonResponse> insert (@RequestBody StudentInsertRequest insertRequest) throws SnowException {
        studentService.insertStudent(Convert.convertStudent(insertRequest.getStudent()));
        return new ResponseEntity<>(new CommonResponse(true), HttpStatus.OK);
    }

}