class TimeMap {
    Map<String, Map<Integer, List<String>>> timeBasedMap;
    public TimeMap() {
        timeBasedMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!timeBasedMap.containsKey(key)) {
            timeBasedMap.put(key, new HashMap<>());
        }
        if (!timeBasedMap.get(key).containsKey(timestamp)) {
            timeBasedMap.get(key).put(timestamp, new ArrayList<>());
        }
        timeBasedMap.get(key).get(timestamp).add(value);
    }

    public String get(String key, int timestamp) {
        if (!timeBasedMap.containsKey(key)) {
            return "";
        }
        int seen = 0;
        for (int time : timeBasedMap.get(key).keySet()) {
            if (time <= timestamp) {
                seen = Math.max(seen, time);
            }
        }
        if (seen == 0)
            return "";
        int mood = timeBasedMap.get(key).get(seen).size() - 1;
        return timeBasedMap.get(key).get(seen).get(mood);
    }
}
