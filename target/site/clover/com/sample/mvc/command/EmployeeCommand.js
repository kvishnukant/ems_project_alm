var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":0,"methods":[{"el":11,"sc":2,"sl":9},{"el":15,"sc":2,"sl":13},{"el":19,"sc":2,"sl":17},{"el":23,"sc":2,"sl":21},{"el":27,"sc":2,"sl":25},{"el":31,"sc":2,"sl":29}],"name":"EmployeeCommand","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":13},{"sl":17},{"sl":21},{"sl":29}],"name":"testOnsubmit","pass":true,"statements":[{"sl":14},{"sl":18},{"sl":22},{"sl":30}]},"test_12":{"methods":[{"sl":9},{"sl":13},{"sl":17},{"sl":21},{"sl":25},{"sl":29}],"name":"testOnsubmit","pass":true,"statements":[{"sl":10},{"sl":14},{"sl":18},{"sl":22},{"sl":26},{"sl":30}]},"test_15":{"methods":[{"sl":9},{"sl":13},{"sl":17},{"sl":21},{"sl":29}],"name":"testEmployeeDeleteControllerTrue","pass":true,"statements":[{"sl":10},{"sl":14},{"sl":18},{"sl":22},{"sl":30}]},"test_3":{"methods":[{"sl":9},{"sl":13},{"sl":17},{"sl":21},{"sl":29}],"name":"testEmployeeEditControllerTrue","pass":true,"statements":[{"sl":10},{"sl":14},{"sl":18},{"sl":22},{"sl":30}]},"test_5":{"methods":[{"sl":9},{"sl":13},{"sl":17},{"sl":21},{"sl":25},{"sl":29}],"name":"testOnsubmit","pass":true,"statements":[{"sl":10},{"sl":14},{"sl":18},{"sl":22},{"sl":26},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [3, 12, 5, 15], [3, 12, 5, 15], [], [], [1, 3, 12, 5, 15], [1, 3, 12, 5, 15], [], [], [1, 3, 12, 5, 15], [1, 3, 12, 5, 15], [], [], [1, 3, 12, 5, 15], [1, 3, 12, 5, 15], [], [], [12, 5], [12, 5], [], [], [1, 3, 12, 5, 15], [1, 3, 12, 5, 15], [], [], []]
