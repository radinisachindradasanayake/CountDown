package com.CountDown.TestCases;

import org.testng.annotations.Test;

import com.CountDown.Pages.NavigatingtoPages;

public class PageNavigationTestCase extends SearchProductsTestCase
{
	@Test
	public void PageNavigationTestCase()
	{
		NavigatingtoPages NP= new NavigatingtoPages(Driver);
		NP.Navigation();
	}
}
