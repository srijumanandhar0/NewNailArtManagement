/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nailart;
import nailart.NailModel;

import java.util.List;

/**
 *
 * @author Syresh Manandhar
 */


public class BinarySearch {

    public NailModel searchNailItemByName(String searchName, List<NailModel> nailItem, int left, int right) {
        // Check if the list is empty or indices are invalid
        if (nailItem == null || nailItem.isEmpty() || left > right) {
            return null;
        }

        // Calculate the mid-point of the current range
        int mid = left+(right - left) / 2;

        // Get the customer at the mid-point
        NailModel currentCustomer = nailItem.get(mid);

        // Compare the search name with the first name of the current customer
        int comparison = searchName.compareToIgnoreCase(currentCustomer.getFirstName());

        if (comparison == 0) {
            // Match found
            return currentCustomer;
        } else if (comparison < 0) {
            // Search in the left half
            return searchNailItemByName(searchName, nailItem, left, mid - 1);
        } else {
            // Search in the right half
            return searchNailItemByName(searchName, nailItem, mid + 1, right);
        }
    }
}
