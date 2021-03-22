
public static boolean isUnique(Map<String, String> map) {
	if (map.size() == 0) {
        return true;
    }
    Set<String> string = new HashSet<>();
    for (String key: map.keySet()) {
        String value = map.get(key);
        if (string.contains(value)) {
            return false;
        } else {
            string.add(value);
        }
    }
    return true;
            
}
