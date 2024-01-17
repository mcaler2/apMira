/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author m.caler
 */
public class Curso {
    private String nombre_curso;
    
    
    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }
    
    public void getCursosExcel(String rutaExcel){
        try (FileInputStream fileIn = new FileInputStream("archivo_existente.xlsx");
             Workbook workbook = new XSSFWorkbook(fileIn)) {

            Sheet sheet = workbook.getSheetAt(0);

            // Leer datos de una celda existente
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            String valor = cell.getStringCellValue();
            System.out.println("Valor en la celda A1: " + valor);

            // Puedes leer más datos según sea necesario

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
