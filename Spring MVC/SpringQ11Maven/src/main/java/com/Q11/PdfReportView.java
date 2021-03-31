package com.Q11;

import com.lowagie.text.Table;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class PdfReportView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> model, com.lowagie.text.Document document, com.lowagie.text.pdf.PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
                List<Employee> employeeList=(List<Employee>) model.get("empList");
        Table table= new Table(3);
        table.addCell("Employee ID");
        table.addCell("Employee Name");
        table.addCell("Employee Salary");

        for(Employee employee:employeeList){
            Integer id = employee.getId();
            Float salary = employee.getSalary();
            table.addCell(id.toString());
            table.addCell(employee.getName());
            table.addCell(salary.toString());
        }
        document.add(table);

    }
}
