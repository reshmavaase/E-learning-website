package com.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.model.Devlopment;
import com.example.repository.Developmentrepo;
@Service
@Transactional
public class DevelopmentService{
	@Autowired
	private Developmentrepo repo;
	public DevelopmentService(Developmentrepo repo) {
        this.repo = repo;
    }

	public Devlopment addcourse(Devlopment dev) {
		return repo.save(dev);
	}
	public List<Devlopment> findAllcourses() {
        return repo.findAll();
    }

    public Devlopment updatecourse(Devlopment dev) {
        return repo.save(dev);
    }

    public Devlopment findCourseById(Long id) throws Exception {
        return repo.findCourseById(id)
        		.orElseThrow(() -> new Exception("Course by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id){
        repo.deleteCourseById(id);
    }
}