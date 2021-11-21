package tr.com.hkerembagci.coursescheduler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CourseSchedulerException extends Exception {
    public CourseSchedulerException() {
        super();
    }
    public CourseSchedulerException(String message, Throwable cause) {
        super(message, cause);
    }
    public CourseSchedulerException(String message) {
        super(message);
    }
    public CourseSchedulerException(Throwable cause) {
        super(cause);
    }
}
