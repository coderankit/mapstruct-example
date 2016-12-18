# mapstruct-example

POM XML Entry -

Properties:

    <org.mapstruct.version>1.1.0.Final</org.mapstruct.version>

Dependency:

    <dependency>
      <groupId>org.mapstruct</groupId>
      <artifactId>mapstruct-jdk8</artifactId>
      <version>${org.mapstruct.version}</version>
    </dependency>

Plugin:

    <plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.5.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
					<annotationProcessorPaths>
						<path>
							<groupId>org.mapstruct</groupId>
							<artifactId>mapstruct-processor</artifactId>
							<version>${org.mapstruct.version}</version>
						</path>
					</annotationProcessorPaths>
				</configuration>
    </plugin>
