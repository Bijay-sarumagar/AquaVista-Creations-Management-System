package com.aquarium.util;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class ValidationUtil {

    // Regular expressions for validation
    private static final Pattern NUMERIC_PATTERN = Pattern.compile("\\d+"); // Numeric pattern
    private static final Pattern AQUARIUM_ID_PATTERN = Pattern.compile("^\\d{5}$"); // Aquarium ID with 5 digits
    private static final Pattern ALPHABET_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); // Only alphabets and spaces
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z]+(\\s[a-zA-Z]+){0,2}$"); // Up to 3 words
    private static final Pattern DOUBLE_PATTERN = Pattern.compile("^\\d+(\\.\\d+)?$"); // Numeric for tank size and temperature

    // Helper method to check if a string is null or empty
    private static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates the aquarium ID.
     * It should be numeric and exactly 5 digits.
     *
     * @param aquariumId the aquarium ID to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidAquariumId(String aquariumId, JLabel lblError) {
        if (isNullOrEmpty(aquariumId)) {
            lblError.setText("Aquarium ID cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!AQUARIUM_ID_PATTERN.matcher(aquariumId).matches()) {
            lblError.setText("Aquarium ID must be exactly 5 digits.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the aquarium name.
     * It should contain only alphabets and up to 3 words.
     *
     * @param aquariumName the aquarium name to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidAquariumName(String aquariumName, JLabel lblError) {
        if (isNullOrEmpty(aquariumName)) {
            lblError.setText("Aquarium name cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!NAME_PATTERN.matcher(aquariumName).matches()) {
            lblError.setText("Aquarium name must contain only alphabets and up to 3 words.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the location.
     * It should contain only alphabets and up to 3 words.
     *
     * @param location the location to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidLocation(String location, JLabel lblError) {
        if (isNullOrEmpty(location)) {
            lblError.setText("Location cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!NAME_PATTERN.matcher(location).matches()) {
            lblError.setText("Location must contain only alphabets and up to 3 words.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the tank size.
     * It should be numeric.
     *
     * @param tankSize the tank size to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidTankSize(String tankSize, JLabel lblError) {
        if (isNullOrEmpty(tankSize)) {
            lblError.setText("Tank size cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!DOUBLE_PATTERN.matcher(tankSize).matches()) {
            lblError.setText("Tank size must be a numeric value.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the water type.
     * It should contain only alphabets and up to 3 words.
     *
     * @param waterType the water type to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidWaterType(String waterType, JLabel lblError) {
        if (isNullOrEmpty(waterType)) {
            lblError.setText("Water type cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!NAME_PATTERN.matcher(waterType).matches()) {
            lblError.setText("Water type must contain only alphabets and up to 3 words.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the maintenance.
     * It should contain only alphabets and up to 3 words.
     *
     * @param maintenance the maintenance to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidMaintenance(String maintenance, JLabel lblError) {
        if (isNullOrEmpty(maintenance)) {
            lblError.setText("Maintenance cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!NAME_PATTERN.matcher(maintenance).matches()) {
            lblError.setText("Maintenance must contain only alphabets and up to 3 words.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the temperature.
     * It should be numeric and between 0 and 80.
     *
     * @param temperature the temperature to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidTemperature(String temperature, JLabel lblError) {
        if (isNullOrEmpty(temperature)) {
            lblError.setText("Temperature cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        try {
            double temp = Double.parseDouble(temperature);
            if (temp < 0 || temp > 80) {
                lblError.setText("Temperature must be between 0 and 80 degrees.");
                lblError.setForeground(Color.RED);
                return false;
            }
        } catch (NumberFormatException e) {
            lblError.setText("Temperature must be a valid numeric value.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }

    /**
     * Validates the feeding.
     * It should contain only alphabets and up to 3 words.
     *
     * @param feeding the feeding to validate
     * @param lblError the JLabel to show error messages
     * @return true if valid, false otherwise
     */
    public static boolean isValidFeeding(String feeding, JLabel lblError) {
        if (isNullOrEmpty(feeding)) {
            lblError.setText("Feeding cannot be empty.");
            lblError.setForeground(Color.RED);
            return false;
        }
        if (!NAME_PATTERN.matcher(feeding).matches()) {
            lblError.setText("Feeding must contain only alphabets and up to 3 words.");
            lblError.setForeground(Color.RED);
            return false;
        }
        return true;
    }
}