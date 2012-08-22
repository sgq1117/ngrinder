/*
 * Copyright (C) 2012 - 2012 NHN Corporation
 * All rights reserved.
 *
 * This file is part of The nGrinder software distribution. Refer to
 * the file LICENSE which is part of The nGrinder distribution for
 * licensing details. The nGrinder distribution is available on the
 * Internet at http://nhnopensource.org/ngrinder
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.ngrinder.monitor.agent.collector;

import org.junit.Test;
import org.ngrinder.monitor.MonitorConstants;
import org.ngrinder.monitor.agent.AgentMXBeanStorage;
import org.ngrinder.monitor.agent.mxbean.JavaMonitoringData;

/**
 * Class description.
 *
 * @author Mavlarn
 * @since
 */
public class AgentJavaDataCollectorTest {

	@Test
	public void testGetJavaData() {
		JavaMonitoringData monitorData = new JavaMonitoringData();
		AgentMXBeanStorage.getInstance().addMXBean(MonitorConstants.JAVA, monitorData);
		AgentJavaDataCollector agentJavaDataCollector = new AgentJavaDataCollector();
		agentJavaDataCollector.refresh();
		agentJavaDataCollector.run();
		System.out.println("java monitor data:" + monitorData);
	}

}
