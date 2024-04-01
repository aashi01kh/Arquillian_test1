//package com.example.testthearquillianfirst;
//
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.arquillian.cube.CubeIp;
//import org.arquillian.cube.DockerUrl;
//import org.arquillian.cube.HostIp;
//import org.arquillian.cube.HostPort;
//import org.arquillian.cube.containerobject.Cube;
//import org.arquillian.cube.docker.impl.client.containerobject.dsl.Container;
//import org.arquillian.cube.docker.impl.client.containerobject.dsl.DockerContainer;
//import org.arquillian.cube.docker.impl.model.DockerCube;
//import org.arquillian.cube.docker.impl.requirement.RequiresDocker;
//import org.arquillian.cube.docker.impl.requirement.RequiresDockerMachine;
//import org.arquillian.cube.requirement.ArquillianConditionalRunner;
//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.container.test.api.RunAsClient;
//import org.jboss.arquillian.drone.api.annotation.Drone;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.arquillian.test.api.ArquillianResource;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
//import org.jboss.shrinkwrap.api.spec.WebArchive;
//import org.junit.experimental.categories.Category;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.arquillian.cube.docker.impl.util.Ping.ping;
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//
//import javax.inject.Inject;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.UriBuilder;
//
//import java.io.File;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.springframework.test.util.AssertionErrors.assertTrue;
//
//
//
//@SpringBootTest
//@RunAsClient
//
//@Category({RequiresDocker.class, RequiresDockerMachine.class})
//@RequiresDocker
//@RunWith(ArquillianConditionalRunner.class)
//class TestthearquillianfirstApplicationTests {
//
//
//
//
////DSL
////	@DockerContainer
////	Container pingpong = Container.withContainerName("pingpong")
////			.fromImage("atest1/latest")
////			.withPortBinding(8080)
////			.build();
////
////
////	@Test
////	public void should_return_ok_as_pong() throws IOException {
////		String response = ping(pingpong.getIpAddress(), pingpong.getBindPort(8080));
////		assertThat(response).containsSequence("OK");
////	}
//
////	@Drone
////	WebDriver webDriver;
////
////
////	@HostIp
////	@CubeIp(containerName = "nice_swirles")
////	String ip = "localhost";
////
////	@HostPort(containerName = "pingpong", value = 8080)
////	int port = 8080;
////	URL serverURL;
////
////	@Test
////	public void letstryarquillian() {
////		try {
////			serverURL = new URL("http", ip, port, "/welcome");
////			System.out.println("Server URL: " + serverURL.toString());
////		} catch (MalformedURLException e) {
////			e.printStackTrace(); // Handle exception appropriately
////		}
////
////		HttpURLConnection con = (HttpURLConnection) serverURL.openConnection();
////		con.setRequestMethod("GET");
////
////		BufferedReader in = new BufferedReader(
////				new InputStreamReader(con.getInputStream()));
////		String inputLine;
////		StringBuffer response = new StringBuffer();
////
////		while ((inputLine = in.readLine()) != null) {
////			response.append(inputLine);
////		}
////		in.close();
////
////		assertThat(response.toString(), is("Hello World"));
//
//
//
//
//
//
////		webDriver.get(serverURL.toString());
////		final String message = webDriver.findElement(By.tagName("h1")).getText();
////		assertThat(message).isEqualTo("Hello World");
//
//
////	}
//
//	@Inject
//	private controller controller;
//
//    TestthearquillianfirstApplicationTests() throws MalformedURLException {
//    }
//
//
//    @Test
//	public void testCreateGreeting() {
//		// Arrange
////		controller controller = new controller();
//		String name = "John";
//		String expectedGreeting = "Hello, John!";
//
//		// Act
//		String actualGreeting = controller.createGreeting(name);
//
//		// Assert
//		assertEquals(expectedGreeting, actualGreeting);
//	}
//
//	@Deployment(testable = false)
//	public static WebArchive create() {
//		return ShrinkWrap.create(WebArchive.class)
//				.addClass(controller.class)
//				.addClass(TestthearquillianfirstApplication.class);
////				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
//
//	}
//
//	@Cube
//	public static DockerCube yourDockerContainer;
//
//	@ArquillianResource("yourDockerContainer")
//	private URL base;
//
//
//
//	@Test
//	public void should_parse_and_load_configuration_file() throws IOException {
//		URL obj = new URL("http://localhost:8080/welcome");
//		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//		connection.setRequestMethod("GET");
//
//		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		in.close();
//
//		assertThat(response.toString()).isEqualTo("String Boot docker demo");
//	}
//
//	@ArquillianResource
//	@DockerUrl(containerName = "nice_swirles", exposedPort = 8080)
//	URL url = new URL("http://localhost");
//
//	@HostPort(containerName = "arquillian-cube-wildfly-test", value = 8080)
//	private int port= 8080;
//
////	jboss/wildfly : unit test
//	@Test
//	@RunAsClient
//	public void test() throws Exception {
//		URI uri = UriBuilder.fromUri(url.toURI())
//				.port(port)
//				.path("resources")
//				.path("hello")
//				.build();
//
////		String hello = ClientBuilder.newClient()
////				.target(uri)
////				.request(MediaType.TEXT_PLAIN)
////				.get()
////				.readEntity(String.class);
//
//		String name = "John";
//		String expectedGreeting = "Hello, John!";
//
//		// Act
//		String actualGreeting = controller.createGreeting(name);
//
//		// Assert
//		assertEquals(expectedGreeting, actualGreeting);
//	}
//
//
//}
