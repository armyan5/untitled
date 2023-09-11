package test_performance;

import java.util.List;

public interface ListOperationsStrategy {

    void append(int nTimes);

    List getFilledList(int length);

    void get(int nTime, List list);
}
