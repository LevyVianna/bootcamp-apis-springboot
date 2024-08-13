package bootcamp.user_crud_api.exceptions;

import bootcamp.user_crud_api.controllers.UserController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex, WebRequest request) {
        String error = ex.getMessage();
        logger.warn("HttpMessageNotReadableException: " + error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleHttpMessageNotReadableException(IllegalArgumentException ex, WebRequest request) {
        String error = ex.getMessage();
        logger.warn("IllegalArgumentException: " + error);
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}

