        //Write your code h
Comparator<String> customComparator = new Comparator<String>() {
            @Override
     //convert to big decimal inside comparator
        //so permanent string values are never changed
        //aka you only use the BigDecimal values to 
        //compare the strings!
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2); 
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, n, customComparator);
        
