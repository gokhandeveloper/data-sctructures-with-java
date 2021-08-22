package hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assesment {
    @Test
    public void studentCSVDataTest() {

        String[][] csvDatarray = {
                {"student_id", "year", "name"},
                {"student-000000001", "7", "JohnSmith"},
                {"student-000000002", "8", "MichaelMurray"},
                {},
                {"student-000000003", "12", "909ad9sad9"},
                {"student-000000009", "12", "MichaelMurray"},
                {"student-000000009", "12", "Loooooooooooooooooooooooong name"},
                {"student-000000003", "5", "DanielKerr"},
                {"student-000000010", "55", "DanielKerr"},
                {"student-000000007", "-5", "DanielKerr"},
                {"student-000000004", "8", "SandraGravy"},
                {"student-000000005", "7", "FelicityPatron"}
        };

        List<List<String>> csvData = Arrays.stream(csvDatarray)
                .map(Arrays::asList)
                .collect(Collectors.toList());

        List<String> studentIds = new ArrayList<>();
        for (int index = 1; index < csvData.size(); index++) {
            if (validateColumns(csvData, index)) {
                if(!validate(csvData, index)){
                    studentIds.add(getStudentIdColumn(csvData, index));
                }
            }

        }
        List<String> filtered = studentIds.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(filtered);

        }

    private String getStudentIdColumn(List<List<String>> csvData, int index) {
        return csvData.get(index).get(0);
    }

    private boolean validate(List<List<String>> csvData, int index) {
        return     isValidStudentId(csvData, index)
                || isValidYearUpperBound(csvData, index)
                || isValidYearLowerBound(csvData, index)
                || isValidStudentName(csvData, index);
    }

    private boolean validateColumns(List<List<String>> csvData, int index) {
        return csvData.get(index).size()==3;
    }

    private boolean isValidStudentName(List<List<String>> csvData, int index) {
        return csvData.get(index).get(2).length() > 32;
    }

    private boolean isValidYearLowerBound(List<List<String>> csvData, int index) {
        if(csvData.get(index).get(1)!=null || !csvData.get(index).get(1).equals("")) {
            return Integer.valueOf(csvData.get(index).get(1)) < 1;
        }
        return false;
    }

    private boolean isValidYearUpperBound(List<List<String>> csvData, int index) {
        if(csvData.get(index).get(1)!=null || !csvData.get(index).get(1).equals("")) {
            return Integer.valueOf(csvData.get(index).get(1)) > 12;
        }
        return false;
    }

    private boolean isValidStudentId(List<List<String>> csvData, int index) {
        return getStudentIdColumn(csvData, index).length() > 20;
    }

}
