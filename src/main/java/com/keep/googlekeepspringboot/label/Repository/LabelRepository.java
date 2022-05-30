package com.keep.googlekeepspringboot.label.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.notes.Entity.Note;
@Repository
public class LabelRepository implements ILabelRepository {

	  @Autowired
	    public JdbcTemplate  jdbcTemplate;
	
	private HashMap<String, Label> labels = new HashMap<>();

    public HashMap<String, Label> getLabels() {
        return labels;
    }

    public void setLabels(HashMap<String, Label> labels) {
        this.labels = labels;
    }

    public String addLabel(String labelId, Label label) {
        labels.put(labelId,label);
		return labelId;
    }

	@Override
	public int saveLabel(Label label) {
		System.out.println("jdbcTemplate in LabelRepository:"+jdbcTemplate);
		        return jdbcTemplate.update(
		                "insert into tbl_label (labelId, label,userId,noteId) values(?,?,?,?)",
		                label.getLabelId(), label.getLabel(),label.getUserId(),label.getNoteId());
		    
	}

	@Override
	public int updateLabel(Label label) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteLabelById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
//	public List<Label> findAllLabel() {
//		ResultSetExtractor<List<Label>> resultSetExtractor=new ResultSetExtractor<List<Label>>(){  
//		    public List<Label> extractData(ResultSet rs) throws SQLException, DataAccessException{
//		        List<Label> list=new ArrayList<Label>();  
//		        while(rs.next()){  
//		        Label e=new Label();  
//		        e.setLabelId(rs.getNString(1));  
//		        e.setLabel(rs.getNString(2));  
//		        e.setUserId(rs.getInt(3)); 
//		        e.setNoteId(rs.getNString(4));
//		        list.add(e);  
//		        }  
//		        return list;  
//		        } 
//		    };
//		    return jdbcTemplate.query("select * from tbl_label",resultSetExtractor);  
//	  } 
	
	public List<Label>findAllLabel(){
	        String sql = "SELECT * FROM tbl_label";
	        return jdbcTemplate.query(
	                sql,
	                (rs, rowNum) ->
	                        new Label(
	                                rs.getString("labelId"),
	                                rs.getString("label"),
	                                rs.getLong("userId"),
	                                rs.getString("noteId")
	                        )
	        );
	    }
	}
