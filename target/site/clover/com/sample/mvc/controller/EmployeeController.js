var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":22,"methods":[{"el":21,"sc":2,"sl":19},{"el":31,"sc":2,"sl":23}],"name":"EmployeeController","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":19}],"name":"testEmployeeControllerTrue","pass":true,"statements":[{"sl":20}]},"test_8":{"methods":[{"sl":19},{"sl":23}],"name":"testHandleRequestInternal","pass":true,"statements":[{"sl":20},{"sl":27},{"sl":28},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [8, 10], [8, 10], [], [], [8], [], [], [], [8], [8], [], [8], [], [], []]
