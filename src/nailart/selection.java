package nailart;

import java.util.List;

public class selection {

    public List<NailModel> sortByFirstName(List<NailModel> customerList, boolean isDesc) {
        if (customerList == null || customerList.isEmpty()) {
            throw new IllegalArgumentException("Customer list cannot be null or empty.");
        }

        for (int i = 0; i < customerList.size() - 1; i++) {
            int extremumIndex = findExtremumIndexByFirstName(customerList, i, isDesc);
            if (i != extremumIndex) {
                swap(customerList, i, extremumIndex);
            }
        }

        return customerList;
    }

    private int findExtremumIndexByFirstName(List<NailModel> customerList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < customerList.size(); j++) {
            if (shouldSwap(customerList.get(j).getFirstName(), customerList.get(extremumIndex).getFirstName(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    private boolean shouldSwap(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareToIgnoreCase(extremum) > 0 : current.compareToIgnoreCase(extremum) < 0;
    }

    private void swap(List<NailModel> customerList, int i, int j) {
        NailModel temp = customerList.get(i);
        customerList.set(i, customerList.get(j));
        customerList.set(j, temp);
    }
}
