package com.revature.Challenges;

public class Test {
	

		  //static member
		  public static int staticCount = 0;

		  //instance member
		  public int instanceCount = 0;

		  public Test() {
		    staticCount++;
		    this.instanceCount++;
		  }

		  public static int getStaticCount() {
		    return Test.staticCount;
		  }

		  public static void setStaticCount(int staticCount) {
			  Test.staticCount = staticCount;
		  }

		  public int getInstanceCount() {
		    return this.instanceCount;
		  }

		  public void setInstanceCount(int instanceCount) {
		    this.instanceCount = instanceCount;
		  }
		}

