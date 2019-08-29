/**
 * 
 */
package com.univers.architecture.transporter.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.univers.architecture.transporter.model.TaskExecution;

/**
 * @author sabir
 *
 */
public interface ITaskExecutionService {

	public Page<TaskExecution> getAllTaskExecution(Pageable pageable);
}
